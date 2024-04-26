class Overload {
    int min;

    // metod za naogjanje na najmal broj od 2 broja
    void minFun(int n1, int n2) {
        min = n1; 
        if (min > n2)
            min = n2;
        System.out.println("Od broevite " + n1 + " i " + n2 + " najmal e " + min);
    }

    // metod za naigjanje na najmal broj od 3 broja
    void minFun(int n1, int n2, int n3) {
        min = n1;
        if (min > n2)
            min = n2;
        if (min > n3)
            min = n3;
        System.out.println("Od broevite " + n1 + ", " + n2 + ", " + n3 + " najmal e " + min);
    }

    public static void main(String[] args) {
        Overload najmal = new Overload(); // kreiranje objekt
        najmal.minFun(11, 6); // Povik na metod
        najmal.minFun(6, 3, 4); // povikuvanje metod i naogjane na najaml broj
    }
}
