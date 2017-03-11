package com.sdajava.SzukaniePolowkowe;

public class Main {

    public int n;
    int [] tab;
    public int x;

    public Main(int n){
        this.n = n;
        int [] tab = new int[this.n];
            for(int i = 0; i < n; i++){
                tab[i]= i;
            }
        this.tab = tab;
    }

    public void wpisX(int x){
        this.x = x;
    }
    public int szukanie(){
        int l = 1; int p = this.n;
        int s; s = (l + p) / 2;

        while (this.tab[s] != this.x){
            if (l > p){
                return 0;
            }
            else {
                s = (l + p) / 2;

                if (this.tab[s] == this.x) {
                    return s;
                } else if (this.tab[s] > this.x) {
                    p = s - 1;
                } else if (this.tab[s] < this.x) {
                    l = s + 1;
                }
            }
        }
        return s;
    }

    public static void main(String[] args) {
        Main sprawdz = new Main(10);
        sprawdz.wpisX(1);
        System.out.println("podana zmienna posiada w tablicy indeks " + sprawdz.szukanie());

    }
}
