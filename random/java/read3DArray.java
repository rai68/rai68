// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class readArray {
    public static void main(String[] args) {
        String gridString = "";
        int[][] Image = {{1,0,1},{1,1,1},{0,0,0}};
        int c = 0;
        int d = 0;
        
        do {
            do {
                //System.out.println(c + "-" + d + "\n");
                if (readImage(Image, c, d) == "W") {
                    gridString = gridString + readImage(Image, c, d);
                } else if (readImage(Image, c, d) == "B") {
                    gridString = gridString + readImage(Image, c, d);
                }
                d++;
            } while (d <3);
            d = 0;
            c++;
        } while (c < 3);
        System.out.println(gridString);
    }
    
    
    public static String readImage(int[][] Image, int x, int y){
        
        
        int ColourInt = Image[x][y];
        if (ColourInt == 1) {
            return "W";
        } 
        else if (ColourInt == 0) {
            return "B";
        } else {
        return String.valueOf(ColourInt);
        }
    }
}
