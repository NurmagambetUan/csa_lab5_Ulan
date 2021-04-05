package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Assembler {
    public static void main(String[] args) {
        String a = "", b = "", c = "", varname = "";
        int digitThree = 0;
        Map<String, String> db = new HashMap<String, String>();
        Map<String, String> dw = new HashMap<String, String>();
        Map<String, String> dd = new HashMap<String, String>();

        Scanner in = new Scanner(System.in);
        while (true) {
            switch ((varname = in.next()).toUpperCase()) {
                case "ADD":
                    a = in.next();
                    b = in.next();
                    if (db.containsKey(a)) {
                        if (dw.containsKey(b)) {
                            System.out.println("Not result");
                            break;
                        } else if (dd.containsKey(b)) {
                            System.out.println("Not result");
                            break;
                        }
                        digitThree = toDecimal(db.get(a)) + toDecimal(db.get(b));
                        db.replace(a, toStringos(digitThree, db.get(a)));
                        System.out.println(db.get(a));
                    } else if (dw.containsKey(a)) {
                        if (dw.containsKey(b)) {
                            digitThree = toDecimal(dw.get(a)) + toDecimal(dw.get(b));
                            dw.replace(a, toStringos(digitThree, dw.get(a)));
                        } else if (db.containsKey(b)) {
                            digitThree = toDecimal(dw.get(a)) + toDecimal(db.get(b));
                            dw.replace(a, toStringos(digitThree, dw.get(a)));
                        } else if (dd.containsKey(b)) {
                            System.out.println("Not result");
                            break;
                        }
                        System.out.println(dw.get(a));
                    } else if (dd.containsKey(a)) {
                        if (dw.containsKey(b)) {
                            digitThree = toDecimal(dd.get(a)) + toDecimal(dw.get(b));
                            dd.replace(a, toStringos(digitThree, dw.get(a)));
                        } else if (db.containsKey(b)) {
                            digitThree = toDecimal(dd.get(a)) + toDecimal(db.get(b));
                            dd.replace(a, toStringos(digitThree, dw.get(a)));
                        } else if (dd.containsKey(b)) {
                            digitThree = toDecimal(dd.get(a)) + toDecimal(dd.get(b));
                            dd.replace(a, toStringos(digitThree, dd.get(a)));
                        }
                        System.out.println(dd.get(a));
                    }
                    break;

                case "SUB":
                    a = in.next();
                    b = in.next();
                    if (db.containsKey(a)) {
                        if (dw.containsKey(b)) {
                            System.out.println("Not result");
                            break;
                        } else if (dd.containsKey(b)) {
                            System.out.println("Not result");
                            break;
                        }
                        digitThree = toDecimal(db.get(a)) - toDecimal(db.get(b));
                        db.replace(a, toStringos(digitThree, db.get(a)));
                        System.out.println(db.get(a));
                    } else if (dw.containsKey(a)) {
                        if (dw.containsKey(b)) {
                            digitThree = toDecimal(dw.get(a)) - toDecimal(dw.get(b));
                            dw.replace(a, toStringos(digitThree, dw.get(a)));
                        } else if (db.containsKey(b)) {
                            digitThree = toDecimal(dw.get(a)) - toDecimal(db.get(b));
                            dw.replace(a, toStringos(digitThree, dw.get(a)));
                        } else if (dd.containsKey(b)) {
                            System.out.println("Not result");
                            break;
                        }
                        System.out.println(dw.get(a));
                    } else if (dd.containsKey(a)) {
                        if (dw.containsKey(b)) {
                            digitThree = toDecimal(dd.get(a)) - toDecimal(dw.get(b));
                            dd.replace(a, toStringos(digitThree, dw.get(a)));
                        } else if (db.containsKey(b)) {
                            digitThree = toDecimal(dd.get(a)) - toDecimal(db.get(b));
                            dd.replace(a, toStringos(digitThree, dw.get(a)));
                        } else if (dd.containsKey(b)) {
                            digitThree = toDecimal(dd.get(a)) - toDecimal(dd.get(b));
                            dd.replace(a, toStringos(digitThree, dd.get(a)));
                        }
                        System.out.println(dd.get(a));
                    }
                    break;

                case "MUL":
                    a = in.next();
                    b = in.next();
                    if (db.containsKey(a)) {
                        if (dw.containsKey(b)) {
                            System.out.println("Not result");
                            break;
                        } else if (dd.containsKey(b)) {
                            System.out.println("Not result");
                            break;
                        }
                        digitThree = toDecimal(db.get(a)) * toDecimal(db.get(b));
                        db.replace(a, toStringos(digitThree, db.get(a)));
                        System.out.println(db.get(a));
                    } else if (dw.containsKey(a)) {
                        if (dw.containsKey(b)) {
                            digitThree = toDecimal(dw.get(a)) * toDecimal(dw.get(b));
                            dw.replace(a, toStringos(digitThree, dw.get(a)));
                        } else if (db.containsKey(b)) {
                            digitThree = toDecimal(dw.get(a)) * toDecimal(db.get(b));
                            dw.replace(a, toStringos(digitThree, dw.get(a)));
                        } else if (dd.containsKey(b)) {
                            System.out.println("Not result");
                            break;
                        }
                        System.out.println(dw.get(a));
                    } else if (dd.containsKey(a)) {
                        if (dw.containsKey(b)) {
                            digitThree = toDecimal(dd.get(a)) * toDecimal(dw.get(b));
                            dd.replace(a, toStringos(digitThree, dw.get(a)));
                        } else if (db.containsKey(b)) {
                            digitThree = toDecimal(dd.get(a)) * toDecimal(db.get(b));
                            dd.replace(a, toStringos(digitThree, dw.get(a)));
                        } else if (dd.containsKey(b)) {
                            digitThree = toDecimal(dd.get(a)) * toDecimal(dd.get(b));
                            dd.replace(a, toStringos(digitThree, dd.get(a)));
                        }
                        System.out.println(dd.get(a));
                    }
                    break;

                case "DIV":
                    a = in.next();
                    b = in.next();
                    if (db.containsKey(a)) {
                        if (dw.containsKey(b)) {
                            System.out.println("Not result");
                            break;
                        } else if (dd.containsKey(b)) {
                            System.out.println("Not result");
                            break;
                        }
                        digitThree = toDecimal(db.get(a)) / toDecimal(db.get(b));
                        db.replace(a, toStringos(digitThree, db.get(a)));
                        System.out.println(db.get(a));
                    } else if (dw.containsKey(a)) {
                        if (dw.containsKey(b)) {
                            digitThree = toDecimal(dw.get(a)) / toDecimal(dw.get(b));
                            dw.replace(a, toStringos(digitThree, dw.get(a)));
                        } else if (db.containsKey(b)) {
                            digitThree = toDecimal(dw.get(a)) / toDecimal(db.get(b));
                            dw.replace(a, toStringos(digitThree, dw.get(a)));
                        } else if (dd.containsKey(b)) {
                            System.out.println("Not result");
                            break;
                        }
                        System.out.println(dw.get(a));
                    } else if (dd.containsKey(a)) {
                        if (dw.containsKey(b)) {
                            digitThree = toDecimal(dd.get(a)) / toDecimal(dw.get(b));
                            dd.replace(a, toStringos(digitThree, dw.get(a)));
                        } else if (db.containsKey(b)) {
                            digitThree = toDecimal(dd.get(a)) / toDecimal(db.get(b));
                            dd.replace(a, toStringos(digitThree, dw.get(a)));
                        } else if (dd.containsKey(b)) {
                            digitThree = toDecimal(dd.get(a)) / toDecimal(dd.get(b));
                            dd.replace(a, toStringos(digitThree, dd.get(a)));
                        }
                        System.out.println(dd.get(a));
                    }
                    break;

                case "INC":
                    a = in.next();
                    if (db.containsKey(a)) {
                        digitThree = toDecimal(db.get(a)) + 1;
                        db.replace(a, toStringos(digitThree, db.get(a)));
                        System.out.println(db.get(a));
                    } else if (dw.containsKey(a)) {
                        digitThree = toDecimal(dw.get(a)) + 1;
                        dw.replace(a, toStringos(digitThree, dw.get(a)));
                        System.out.println(dw.get(a));
                    } else if (dd.containsKey(a)) {
                        digitThree = toDecimal(dd.get(a)) + 1;
                        dd.replace(a, toStringos(digitThree, dd.get(a)));
                        System.out.println(dd.get(a));
                    }
                    break;

                case "DEC":
                    a = in.next();
                    if (db.containsKey(a)) {
                        digitThree = toDecimal(db.get(a)) - 1;
                        db.replace(a, toStringos(digitThree, db.get(a)));
                        System.out.println(db.get(a));
                    } else if (dw.containsKey(a)) {
                        digitThree = toDecimal(dw.get(a)) - 1;
                        dw.replace(a, toStringos(digitThree, dw.get(a)));
                        System.out.println(dw.get(a));
                    } else if (dd.containsKey(a)) {
                        digitThree = toDecimal(dd.get(a)) - 1;
                        dd.replace(a, toStringos(digitThree, dd.get(a)));
                        System.out.println(dd.get(a));
                    }
                    System.out.println(db.get(a));
                    break;

                case "MOV":
                    a = in.next();
                    b = in.next();
                    if (db.containsKey(a)) {
                        if (db.containsKey(b)) db.replace(a, db.get(b));
                        else if (dw.containsKey(b)) System.out.println("Not result");
                        else if (dd.containsKey(b)) System.out.println("Not result");
                        else {
                            if (isNumeric(b)) db.replace(a, b + 'd');
                            else db.replace(a, b);
                        }
                    } else if (dw.containsKey(a)) {
                        if (db.containsKey(b)) dw.replace(a, db.get(b));
                        else if (dw.containsKey(b)) dw.replace(a, dw.get(b));
                        else if (dd.containsKey(b)) System.out.println("Not result");
                        else {

                            if (isNumeric(b)) dw.replace(a, b + 'd');
                            else dw.replace(a, b);
                        }
                    } else if (dd.containsKey(a)) {
                        if (db.containsKey(b)) dd.replace(a, db.get(b));
                        else if (dw.containsKey(b)) dd.replace(a, dw.get(b));
                        else if (dd.containsKey(b)) dd.replace(a, dd.get(b));
                        else {
                            if (isNumeric(b)) dw.replace(a, b + 'd');
                            else dw.replace(a, b);
                        }
                    }
                    break;

                case "XCHG":
                    a = in.next();
                    b = in.next();
                    c = db.get(a);
                    if (db.containsKey(a)) {
                        if (db.containsKey(b)) {
                            db.replace(a, db.get(b));
                            db.replace(b, c);
                        } else System.out.println("Not result");
                    } else if (dw.containsKey(a)) {
                        if (db.containsKey(b)) {
                            dw.replace(a, db.get(b));
                            dw.replace(b, c);
                        } else if (dw.containsKey(b)) {
                            dw.replace(a, dw.get(b));
                            dw.replace(b, c);
                        } else System.out.println("Not result");
                    } else if (dd.containsKey(a)) {
                        if (db.containsKey(b)) {
                            dd.replace(a, db.get(b));
                            dd.replace(b, c);
                        } else if (dw.containsKey(b)) {
                            dd.replace(a, dw.get(b));
                            dd.replace(b, c);
                        } else if (dd.containsKey(b)) {
                            dd.replace(a, dd.get(b));
                            dd.replace(b, c);
                        } else System.out.println("Not result");
                    } else {
                        System.out.println("No result");
                    }
                    break;

                case "RESULT":
                    System.out.println(db.get(a));
                    break;

                default:
                    a = varname;
                    b = in.next();
                    c = in.nextLine();

                    while (c.charAt(0) == ' ' || c.charAt(0) == 39 || c.charAt(0) == 34) c = removeCharAt(c, 0);
                    while (c.charAt(c.length() - 1) == ' ' || c.charAt(c.length() - 1) == 39 || c.charAt(c.length() - 1) == 34)
                        c = removeCharAt(c, c.length() - 1);

                    System.out.println(c);
                    if (b.toLowerCase().equals("db")) {
                        if (isNumeric(c)) db.put(a, c + 'd');
                        else db.put(a, c);
                    } else if (b.toLowerCase().equals("dw")) {
                        b = in.next();
                        dw.put(a, b);
                    }
                    break;

            }

        }
    }

    public static boolean isNumeric(String str) {
        return str.matches("-?\\d+(\\.\\d+)?");
    }

    public static String toStringos(int digitThree, String firstDigit) {
        if (typeOf(firstDigit).equals("h")) return (Integer.toHexString(digitThree) + "h");
        else if (typeOf(firstDigit).equals("d")) return (Integer.toString(digitThree) + "d");
        else if (typeOf(firstDigit).equals("q")) return (Integer.toOctalString(digitThree) + "q");
        else return (Integer.toBinaryString(digitThree) + "b");
    }

    public static int toDecimal(String str) {
        if (typeOf(str).equals("h")) return Integer.parseInt(str.substring(0, str.length() - 1), 16);
        else if (typeOf(str).equals("q")) return Integer.parseInt(str.substring(0, str.length() - 1), 8);
        else if (typeOf(str).equals("b")) return Integer.parseInt(str.substring(0, str.length() - 1), 2);
        else return Integer.parseInt(str.substring(0, str.length() - 1));
    }

    public static String typeOf(String str) {
        return str.substring(str.length() - 1, str.length()).toLowerCase();
    }

    public static String removeCharAt(String s, int pos) {
        return s.substring(0, pos) + s.substring(pos + 1);
    }
}
