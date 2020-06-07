package HeadDump;

// var. 1191
public class Lab4 {
    public static void main(String[] args) {
        D a = new D();
        D b = new B();
        B c = new B();
        b.f39();
        a.f31();
        a.f27();
        c.f19();
        c.f7();
        a.f13();
        a.f1();
        b.f49();
        b.f34();
        c.f4();
        c.f9();
        b.f32();
        b.f18();
        b.f14();
        c.f36();
        c.f15();
        a.f25(a);
        c.f25(b);
        c.f25(c);
        c.f48();
        c.f37();
        c.f10();
        Thread t = new Thread(new Runnable() {
            public void run() {
                while(true) {
                    try {
                        B d = new B();
                        d.f46();
                        Thread.sleep(9);
                    } catch(Exception e) {
                        // Do nothing
                    }
                }
            }
        });
        t.start();
    }
}
class D {
    int f50;
    int f33;
    int f44;
    int f8;
    int f5;
    long f11;
    long f38;
    long f20;
    java.io.ObjectOutputStream fileStrm;
    java.io.ObjectOutputStream sampleOut;
    java.io.ObjectOutputStream printWrtr;
    int[] f12 = {-3, 0, 0, 0, -3};
    int[] f47 = {1, -2, -2, -1, -1};
    int[] f40 = {2, -2, -3, -3, -2};
    static String stack = "";
    static java.util.Map<java.net.URI,byte[]> cache = new java.util.HashMap<>();
    static int f29;
    static int f42;
    static int f45;
    static int f43;
    static int f16;
    java.util.List<String> f6 = new java.util.ArrayList<>();
    java.util.List<String> f21 = new java.util.ArrayList<>();
    java.util.List<String> f28 = new java.util.ArrayList<>();
    public D() {
        f50 = 2;
        f33 = 1;
        f44 = 8;
        f8 = 2;
        f5 = 2;
        f11 = 8L;
        f38 = 4L;
        f20 = 8L;
        try {
            fileStrm = new java.io.ObjectOutputStream(new java.io.FileOutputStream("fileStrm.txt"));
            sampleOut = new java.io.ObjectOutputStream(new java.io.FileOutputStream("sampleOut.txt"));
            printWrtr = new java.io.ObjectOutputStream(new java.io.FileOutputStream("printWrtr.txt"));
        } catch (java.lang.Exception e) {
            // Do nothing
        }
    }
    public void init() {
        try {
            if (fileStrm == null) fileStrm = new java.io.ObjectOutputStream(new java.io.FileOutputStream("fileStrm.txt"));
            System.out.println("Thread : " + Thread.currentThread() + ", fileStrm = " + fileStrm);
        } catch(Exception e) {
            // Ignore it
        }
        try {
            if (sampleOut == null) sampleOut = new java.io.ObjectOutputStream(new java.io.FileOutputStream("sampleOut.txt"));
            System.out.println("Thread : " + Thread.currentThread() + ", sampleOut = " + sampleOut);
        } catch(Exception e) {
            // Ignore it
        }
        try {
            if (printWrtr == null) printWrtr = new java.io.ObjectOutputStream(new java.io.FileOutputStream("printWrtr.txt"));
            System.out.println("Thread : " + Thread.currentThread() + ", printWrtr = " + printWrtr);
        } catch(Exception e) {
            // Ignore it
        }
    }
    public byte[] getValueFromCache(String s) {
        try {
            java.net.URI url = new java.net.URI(s);
            if(!cache.containsKey(url)) {
                cache.put(url, new byte[524288]);
            }
            return cache.get(url);
        } catch (Exception e) {
            System.out.println("Error: invalid URL!");
            return null;
        }
    }
    public void f39() {
        Thread t = new Thread(new Runnable() {
            public void run() {
                init();
                int i = 0;
                while(true) {
                    i++;
                    try {
                        synchronized(fileStrm) {
                            fileStrm.writeObject("метод f39 в классе D (#" + String.valueOf(i) + ")");
                            Thread.sleep(6);
                            fileStrm.reset();
                        }
                    } catch(Exception e) {
                        // Do nothing
                    }
                }
            }
        });
        t.start();
    }
    public void f31() {
        Thread t = new Thread(new Runnable() {
            public void run() {
                init();
                int i = 0;
                while(true) {
                    i++;
                    try {
                        synchronized(sampleOut) {
                            sampleOut.writeObject("метод f31 в классе D (#" + String.valueOf(i) + ")");
                            Thread.sleep(5);
                            sampleOut.flush();
                            sampleOut.reset();
                        }
                    } catch(Exception e) {
                        // Do nothing
                    }
                }
            }
        });
        t.start();
    }
    public void f27() {
        Thread t = new Thread(new Runnable() {
            public void run() {
                init();
                int i = 0;
                while(true) {
                    i++;
                    try {
                        synchronized(fileStrm) {
                            fileStrm.writeObject("метод f27 в классе D (#" + String.valueOf(i) + ")");
                            Thread.sleep(5);
                            fileStrm.flush();
                            fileStrm.reset();
                        }
                    } catch(Exception e) {
                        // Do nothing
                    }
                }
            }
        });
        t.start();
    }
    public void f19() {
        Thread t = new Thread(new Runnable() {
            public void run() {
                init();
                int i = 0;
                while(true) {
                    i++;
                    try {
                        synchronized(fileStrm) {
                            fileStrm.writeObject("метод f19 в классе D (#" + String.valueOf(i) + ")");
                            Thread.sleep(5);
                            fileStrm.flush();
                            fileStrm.reset();
                        }
                    } catch(Exception e) {
                        // Do nothing
                    }
                }
            }
        });
        t.start();
    }
    public void f7() {
        Thread t = new Thread(new Runnable() {
            public void run() {
                init();
                int i = 0;
                while(true) {
                    i++;
                    try {
                        synchronized(sampleOut) {
                            sampleOut.writeObject("метод f7 в классе D (#" + String.valueOf(i) + ")");
                            Thread.sleep(5);
                            sampleOut.flush();
                            sampleOut.reset();
                        }
                    } catch(Exception e) {
                        // Do nothing
                    }
                }
            }
        });
        t.start();
    }
    public void f13() {
        Thread t = new Thread(new Runnable() {
            public void run() {
                init();
                int i = 0;
                while(true) {
                    i++;
                    try {
                        synchronized(printWrtr) {
                            printWrtr.writeObject("метод f13 в классе D (#" + String.valueOf(i) + ")");
                            Thread.sleep(6);
                            printWrtr.flush();
                            printWrtr.reset();
                        }
                    } catch(Exception e) {
                        // Do nothing
                    }
                }
            }
        });
        t.start();
    }
    public void f9() {
        Thread t = new Thread(new Runnable() {
            public void run() {
                int i = 0;
                while(true) {
                    i++;
                    try {
                        synchronized(stack) {
                            stack += "2";
                            Thread.sleep(5);
                        }
                    } catch(Exception e) {
                        // Do nothing
                    }
                }
            }
        });
        t.start();
    }
    public void f32() {
        Thread t = new Thread(new Runnable() {
            public void run() {
                int i = 0;
                while(true) {
                    i++;
                    try {
                        synchronized(stack) {
                            stack = stack.substring(0, stack.length() - 1);
                            Thread.sleep(6);
                        }
                    } catch(Exception e) {
                        // Do nothing
                    }
                }
            }
        });
        t.start();
    }
    public void f14() {
        Thread t = new Thread(new Runnable() {
            public void run() {
                int i = 0;
                while(true) {
                    i++;
                    try {
                        synchronized(stack) {
                            stack += "5";
                            Thread.sleep(6);
                        }
                    } catch(Exception e) {
                        // Do nothing
                    }
                }
            }
        });
        t.start();
    }
    public void f36() {
        Thread t = new Thread(new Runnable() {
            public void run() {
                int i = 0;
                while(true) {
                    i++;
                    try {
                        synchronized(stack) {
                            stack += "5";
                            Thread.sleep(6);
                        }
                    } catch(Exception e) {
                        // Do nothing
                    }
                }
            }
        });
        t.start();
    }
    public void f15() {
        Thread t = new Thread(new Runnable() {
            public void run() {
                int i = 0;
                while(true) {
                    i++;
                    try {
                        synchronized(stack) {
                            stack += "6";
                            Thread.sleep(5);
                        }
                    } catch(Exception e) {
                        // Do nothing
                    }
                }
            }
        });
        t.start();
    }
    public void f18() {
        Thread t = new Thread(new Runnable() {
            public void run() {
                int i = 0;
                while(true) {
                    i++;
                    try {
                        synchronized(stack) {
                            stack += "6";
                            Thread.sleep(5);
                        }
                    } catch(Exception e) {
                        // Do nothing
                    }
                }
            }
        });
        t.start();
    }
    public static void f1() {
        System.out.println("метод f1 в классе D");
        System.out.println(f29);
    }
    public static void f49() {
        System.out.println("метод f49 в классе D");
        System.out.println((f29 - 2));
    }
    public static void f34() {
        System.out.println("метод f34 в классе D");
        System.out.println(f42);
    }
    public static void f4() {
        System.out.println("метод f4 в классе D");
        System.out.println((f42 - 3));
    }
    public void f25(D r) {
        r.f39();
    }
    public void f25(B r) {
        r.f31();
    }
}
class B extends D {
    public B() {
        f50 = 7;
        f8 = 4;
        f11 = 0L;
        f38 = 0L;
        f20 = 5L;
    }
    public void f39() {
        Thread t = new Thread(new Runnable() {
            public void run() {
                init();
                int i = 0;
                while(true) {
                    i++;
                    try {
                        synchronized(sampleOut) {
                            sampleOut.writeObject("метод f39 в классе B (#" + String.valueOf(i) + ")");
                            Thread.sleep(12);
                            sampleOut.reset();
                        }
                    } catch(Exception e) {
                        // Do nothing
                    }
                }
            }
        });
        t.start();
    }
    public void f31() {
        Thread t = new Thread(new Runnable() {
            public void run() {
                init();
                int i = 0;
                while(true) {
                    i++;
                    try {
                        synchronized(sampleOut) {
                            sampleOut.writeObject("метод f31 в классе B (#" + String.valueOf(i) + ")");
                            Thread.sleep(8);
                            sampleOut.flush();
                            sampleOut.reset();
                        }
                    } catch(Exception e) {
                        // Do nothing
                    }
                }
            }
        });
        t.start();
    }
    public void f19() {
        Thread t = new Thread(new Runnable() {
            public void run() {
                init();
                int i = 0;
                while(true) {
                    i++;
                    try {
                        synchronized(printWrtr) {
                            printWrtr.writeObject("метод f19 в классе B (#" + String.valueOf(i) + ")");
                            Thread.sleep(9);
                            printWrtr.flush();
                            printWrtr.reset();
                        }
                    } catch(Exception e) {
                        // Do nothing
                    }
                }
            }
        });
        t.start();
    }
    public void f13() {
        Thread t = new Thread(new Runnable() {
            public void run() {
                init();
                int i = 0;
                while(true) {
                    i++;
                    try {
                        synchronized(printWrtr) {
                            printWrtr.writeObject("метод f13 в классе B (#" + String.valueOf(i) + ")");
                            Thread.sleep(5);
                            printWrtr.reset();
                        }
                    } catch(Exception e) {
                        // Do nothing
                    }
                }
            }
        });
        t.start();
    }
    public void f48() {
        Thread t = new Thread(new Runnable() {
            public void run() {
                while(true) {
                    try {
                        synchronized(cache) {
                            getValueFromCache("https://www.google.com");
                            Thread.sleep(6);
                        }
                    } catch(Exception e) {
                        // Do nothing
                    }
                }
            }
        });
        t.start();
    }
    public void f37() {
        Thread t = new Thread(new Runnable() {
            public void run() {
                while(true) {
                    try {
                        synchronized(cache) {
                            getValueFromCache("https://www.google.com");
                            Thread.sleep(12);
                        }
                    } catch(Exception e) {
                        // Do nothing
                    }
                }
            }
        });
        t.start();
    }
    public void f10() {
        Thread t = new Thread(new Runnable() {
            public void run() {
                while(true) {
                    try {
                        synchronized(cache) {
                            getValueFromCache("https://www.google.com");
                            Thread.sleep(14);
                        }
                    } catch(Exception e) {
                        // Do nothing
                    }
                }
            }
        });
        t.start();
    }
    public static void f1() {
        System.out.println("метод f1 в классе B");
        System.out.println(--f29);
    }
    public static void f49() {
        System.out.println("метод f49 в классе B");
        System.out.println(f42);
    }
    public static void f34() {
        System.out.println("метод f34 в классе B");
        System.out.println((f42 - 1));
    }
    public static void f4() {
        System.out.println("метод f4 в классе B");
        System.out.println(f42);
    }
    public void f41() {
        for(int i = 0; i < 9; i++) {
            this.f6.add(String.valueOf(System.nanoTime()));
            // System.out.println(this.f6.size());
        }
    }
    public void f3() {
        for(int i = 0; i < 9; i++) {
            this.f6.add(String.valueOf(System.nanoTime()));
            // System.out.println(this.f6.size());
        }
    }
    public void f46() {
        for(int i = 0; i < 6; i++) {
            this.f28.add(String.valueOf(System.nanoTime()));
            // System.out.println(this.f28.size());
        }
    }
    public void f2() {
        for(int i = 0; i < 6; i++) {
            this.f28.add(String.valueOf(System.nanoTime()));
            // System.out.println(this.f28.size());
        }
    }
    public void f25(D r) {
        r.f27();
    }
    public void f25(B r) {
        r.f19();
    }
}