package com.company.oviktor.booktasks.accesscontrol.inpackage;

public class Ex05AccessExamples1 {

        public int a;
        private int b;
        protected int c;
        int d;

        public void a(){}
        private void b(){}
        protected void c(){}
        void d(){}

    public static void main(String[] args) {
            Ex05AccessExamples1 ex = new Ex05AccessExamples1();
            ex.a = 1;
            ex.b = 2;
            ex.c = 3;
            ex.d = 4;

            ex.a();
            ex.b();
            ex.c();
            ex.d();

    }
}
