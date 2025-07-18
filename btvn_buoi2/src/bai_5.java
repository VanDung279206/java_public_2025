public class bai_5 {
    public static void main(String[] args){
        System.out.println("Bang cuu chuong cua so 5: ");
        for(int i = 1; i<=10; i++){
            System.out.println("5x"+ i +" = " + (5*i));
        }
        int tc1 = 0;
        for(int i = 2; i<=100; i += 2){
                tc1 += i;
        }
        System.out.println("tong cac so chan tu 1 den 100 dung for = " + tc1);
        int tc2 = 0;
        int i=2;
        while(i<=100){
                tc2 += i;
                i += 2;
        }
        System.out.println("tong cac so chan tu 1 dem 100 dung while = " + tc2);
    }
}
