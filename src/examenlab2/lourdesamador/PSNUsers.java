/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenlab2.lourdesamador;

import java.io.EOFException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author porti
 */
enum Trophy {
    PLATINO(5), ORO(3), PLATA(2), BRONCE(1);

    public final int points;

    Trophy(int points) {
        this.points = points;
    }
}

public class PSNUsers {

    private RandomAccessFile raf;
    HashTable users;

    public PSNUsers(String filePath) throws IOException {
        raf = new RandomAccessFile(filePath, "rw");
        users = new HashTable();
        reloadHashTable();
    }

    private void reloadHashTable() throws IOException {
        try {
            raf.seek(0);
            while (raf.getFilePointer() < raf.length()) {
                long pos = raf.getFilePointer();

                String username = raf.readUTF();
                int points = raf.readInt();
                int trophyCount = raf.readInt();
                boolean isActive = raf.readBoolean();

                if (isActive) {
                    users.add(username, pos);
                }
            }
        } catch (EOFException e) {
        }
    }

    public void addUser(String username) throws IOException {
        long pos = raf.length();
        raf.seek(pos);
        raf.writeUTF(username);
        raf.writeInt(0);
        raf.writeInt(0);
        raf.writeBoolean(true);
        users.add(username, pos);
    }

    public void deactiveUser(String username) throws IOException {
        long pos = users.search(username);
        if (pos != -1) {
            System.out.println("Usuario encontrado. Posicion: " + pos);
            raf.seek(pos + 2 * Integer.BYTES);
            raf.writeInt(0);
            raf.writeBoolean(false);
            users.remove(username);
            System.out.println("Usuario desactivado exitosamente");
        } else {
            System.out.println("El usuario no existe");

        }
    }

    public void addTrophieTo(String username, String trophyGame, String trophyName, Trophy type) throws IOException {
        long pos = users.search(username);
        if (pos != -1) {
            raf.seek(pos);

            String currentUsername = raf.readUTF();
            int trophyCount = raf.readInt();
            int points = raf.readInt();

            long currentPosition = raf.getFilePointer();

            raf.writeUTF(username);
            raf.writeUTF(trophyGame);
            raf.writeUTF(trophyName);
            raf.writeUTF(getCurrentDate());

            raf.seek(currentPosition);
            raf.writeInt(trophyCount + 1);

            raf.writeInt(type.points);

        }
    }
    
    private String getCurrentDate(){
        SimpleDateFormat sdf = new SimpleDateFormat("  dd - MM - yyyy  HH:mm");
        return sdf.format(new Date());
    }

    public void playerInfo(String username) throws IOException {
        long pos = users.search(username);
        if (pos != -1) {
            raf.seek(pos);

            StringBuilder userInfo = new StringBuilder();
            try {
                userInfo.append("Username: ").append(raf.readUTF()).append("\n");
                int trophyCount = raf.readInt();
                userInfo.append("Trofeos: ").append(trophyCount).append("\n");
                userInfo.append("Puntos: ").append(raf.readInt()).append("\n");

                for (int i = 0; i < trophyCount; i++) {

                    if (raf.getFilePointer() < raf.length()) {

                        userInfo.append("Fecha: ").append(raf.readUTF()).append("\n");
                        userInfo.append("Tipo: ").append(raf.readUTF()).append("\n");
                        userInfo.append("Juego: ").append(raf.readUTF()).append("\n");
                        userInfo.append("Descripcion: ").append(raf.readUTF()).append("\n");
                    } else {
                        break;
                    }
                }
                JOptionPane.showMessageDialog(null, userInfo.toString(), "Informacion del Usuario", JOptionPane.INFORMATION_MESSAGE);
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, "Error al leer la informacion del usuario", "Error", JOptionPane.ERROR_MESSAGE);

            }
        } else {
            JOptionPane.showMessageDialog(null, "El usuario no existe", "Error", JOptionPane.ERROR_MESSAGE);

        }
    }
}
