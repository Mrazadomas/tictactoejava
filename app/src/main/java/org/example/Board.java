package org.example;
import java.util.ArrayList;

public class Board {

    public static String[] gboard = {" ", " ", " |", " ", " ", " |", " ", " ", " ", 
        "-----------", 
        " ", " ", " |", " ", " ", " |", " ", " ", " ", 
        "-----------", 
        " ", " ", " |", " ", " ", " |", " ", " ", " "};

    private static String[] clearboard = {" ", " ", " |", " ", " ", " |", " ", " ", " ", 
        "-----------", 
        " ", " ", " |", " ", " ", " |", " ", " ", " ", 
        "-----------", 
        " ", " ", " |", " ", " ", " |", " ", " ", " "};

    
    private static int t1 = 1;
    private static int t2 = 4;
    private static int t3 = 7;
    private static int t4 = 11;
    private static int t5 = 14;
    private static int t6 = 17;
    private static int t7 = 21;
    private static int t8 = 24;
    private static int t9 = 27;

    public static int tileConversion(int tile) {
        if (tile == 1) {
            return t1;
        } else if (tile == 2) {
            return t2;
        } else if (tile == 3) {
            return t3;
        } else if (tile == 4) {
            return t4;
        } else if (tile == 5) {
            return t5;
        } else if (tile == 6) {
            return t6;
        } else if (tile == 7) {
            return t7;
        } else if (tile == 8) {
            return t8;
        } else {
            return t9;
        }
    }

    public static int checkWinx(String[] gameboard) {
        ArrayList<Integer> xTiles = new ArrayList<Integer>();
        for (int i = 0; i < gameboard.length; i++) {
            if (gameboard[i].equals("x")) {
                xTiles.add(i);
            }
        }
        for (int i = 0; i < xTiles.size(); i++) {
            if (xTiles.get(i) == 1) {
                for (int x = 0; x < xTiles.size(); x++) {
                    if (xTiles.get(x) == 4) {
                        for (int y = 0; y < xTiles.size(); y++) {
                            if (xTiles.get(y) == 7) {
                                return 1;
                            }
                        }
                    }
                }
            }
        }
        for (int i = 0; i < xTiles.size(); i++) {
            if (xTiles.get(i) == 11) {
                for (int x = 0; x < xTiles.size(); x++) {
                    if (xTiles.get(x) == 14) {
                        for (int y = 0; y < xTiles.size(); y++) {
                            if (xTiles.get(y) == 17) {
                                return 1;
                            }
                        }
                    }
                }
            }
        }
        for (int i = 0; i < xTiles.size(); i++) {
            if (xTiles.get(i) == 21) {
                for (int x = 0; x < xTiles.size(); x++) {
                    if (xTiles.get(x) == 24) {
                        for (int y = 0; y < xTiles.size(); y++) {
                            if (xTiles.get(y) == 27) {
                                return 1;
                            }
                        }
                    }
                }
            }
        }
        for (int i = 0; i < xTiles.size(); i++) {
            if (xTiles.get(i) == 1) {
                for (int x = 0; x < xTiles.size(); x++) {
                    if (xTiles.get(x) == 11) {
                        for (int y = 0; y < xTiles.size(); y++) {
                            if (xTiles.get(y) == 21) {
                                return 1;
                            }
                        }
                    }
                }
            }
        }
        for (int i = 0; i < xTiles.size(); i++) {
            if (xTiles.get(i) == 4) {
                for (int x = 0; x < xTiles.size(); x++) {
                    if (xTiles.get(x) == 14) {
                        for (int y = 0; y < xTiles.size(); y++) {
                            if (xTiles.get(y) == 24) {
                                return 1;
                            }
                        }
                    }
                }
            }
        }
        for (int i = 0; i < xTiles.size(); i++) {
            if (xTiles.get(i) == 7) {
                for (int x = 0; x < xTiles.size(); x++) {
                    if (xTiles.get(x) == 17) {
                        for (int y = 0; y < xTiles.size(); y++) {
                            if (xTiles.get(y) == 27) {
                                return 1;
                            }
                        }
                    }
                }
            }
        }
        for (int i = 0; i < xTiles.size(); i++) {
            if (xTiles.get(i) == 1) {
                for (int x = 0; x < xTiles.size(); x++) {
                    if (xTiles.get(x) == 14) {
                        for (int y = 0; y < xTiles.size(); y++) {
                            if (xTiles.get(y) == 27) {
                                return 1;
                            }
                        }
                    }
                }
            }
        }
        for (int i = 0; i < xTiles.size(); i++) {
            if (xTiles.get(i) == 7) {
                for (int x = 0; x < xTiles.size(); x++) {
                    if (xTiles.get(x) == 14) {
                        for (int y = 0; y < xTiles.size(); y++) {
                            if (xTiles.get(y) == 21) {
                                return 1;
                            }
                        }
                    }
                }
            }
        }
        return 0;
    }

    public static int checkWino(String[] gameboard) {
        ArrayList<Integer> xTiles = new ArrayList<Integer>();
        for (int i = 0; i < gameboard.length; i++) {
            if (gameboard[i].equals("o")) {
                xTiles.add(i);
            }
        }
        for (int i = 0; i < xTiles.size(); i++) {
            if (xTiles.get(i) == 1) {
                for (int x = 0; x < xTiles.size(); x++) {
                    if (xTiles.get(x) == 4) {
                        for (int y = 0; y < xTiles.size(); y++) {
                            if (xTiles.get(y) == 7) {
                                return 1;
                            }
                        }
                    }
                }
            }
        }
        for (int i = 0; i < xTiles.size(); i++) {
            if (xTiles.get(i) == 11) {
                for (int x = 0; x < xTiles.size(); x++) {
                    if (xTiles.get(x) == 14) {
                        for (int y = 0; y < xTiles.size(); y++) {
                            if (xTiles.get(y) == 17) {
                                return 1;
                            }
                        }
                    }
                }
            }
        }
        for (int i = 0; i < xTiles.size(); i++) {
            if (xTiles.get(i) == 21) {
                for (int x = 0; x < xTiles.size(); x++) {
                    if (xTiles.get(x) == 24) {
                        for (int y = 0; y < xTiles.size(); y++) {
                            if (xTiles.get(y) == 27) {
                                return 1;
                            }
                        }
                    }
                }
            }
        }
        for (int i = 0; i < xTiles.size(); i++) {
            if (xTiles.get(i) == 1) {
                for (int x = 0; x < xTiles.size(); x++) {
                    if (xTiles.get(x) == 11) {
                        for (int y = 0; y < xTiles.size(); y++) {
                            if (xTiles.get(y) == 21) {
                                return 1;
                            }
                        }
                    }
                }
            }
        }
        for (int i = 0; i < xTiles.size(); i++) {
            if (xTiles.get(i) == 4) {
                for (int x = 0; x < xTiles.size(); x++) {
                    if (xTiles.get(x) == 14) {
                        for (int y = 0; y < xTiles.size(); y++) {
                            if (xTiles.get(y) == 24) {
                                return 1;
                            }
                        }
                    }
                }
            }
        }
        for (int i = 0; i < xTiles.size(); i++) {
            if (xTiles.get(i) == 7) {
                for (int x = 0; x < xTiles.size(); x++) {
                    if (xTiles.get(x) == 17) {
                        for (int y = 0; y < xTiles.size(); y++) {
                            if (xTiles.get(y) == 27) {
                                return 1;
                            }
                        }
                    }
                }
            }
        }
        for (int i = 0; i < xTiles.size(); i++) {
            if (xTiles.get(i) == 1) {
                for (int x = 0; x < xTiles.size(); x++) {
                    if (xTiles.get(x) == 14) {
                        for (int y = 0; y < xTiles.size(); y++) {
                            if (xTiles.get(y) == 27) {
                                return 1;
                            }
                        }
                    }
                }
            }
        }
        for (int i = 0; i < xTiles.size(); i++) {
            if (xTiles.get(i) == 7) {
                for (int x = 0; x < xTiles.size(); x++) {
                    if (xTiles.get(x) == 14) {
                        for (int y = 0; y < xTiles.size(); y++) {
                            if (xTiles.get(y) == 21) {
                                return 1;
                            }
                        }
                    }
                }
            }
        }
        return 0;
    }

    public static boolean tileCheck(int tile, String[] gameboard) {
        if (gameboard[tile] != " ") {
            System.out.println("Tile is already marked.");
            return false;
            
        } 
        return true;
    }

    public static void clear() {
        for (int i = 0; i < gboard.length; i++) {
            gboard[i] = clearboard[i];
        }

    }
}

