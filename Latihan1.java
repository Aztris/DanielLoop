
package latihan1;

public class Latihan1 {

    public static void main(String[] args) {
     
        int utama = 1, ck = 210, sarang, srg, tot, gt = 0, sarang2=0;
        
        while(utama<=3){
            sarang = 1;
            srg = sarang;
            tot = 0;
            do{
                System.out.print(ck+" ");
                tot+=ck;
                ck-=10;
                srg++;
            }while(srg<=4);
            
            System.out.println(" = "+tot);
            gt += tot;
            utama++;
        }
        
        System.out.println("=====================================");
        System.out.println("     Total Keseluruhan    = "+gt);
        System.out.println("");
    }
}
