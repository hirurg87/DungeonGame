import java.io.*;
import java.sql.SQLOutput;

class DungeonTest {
    public static void main(String[] args) {

    }

    public class DungeonGame implements Serializable{
        public int x = 3;
        transient long y = 4;
        private short z = 5;
    }



}
