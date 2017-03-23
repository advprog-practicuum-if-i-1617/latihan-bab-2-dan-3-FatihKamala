public class Deklarasi {
    public String belasan = "Belas ";
    public String puluhan = "Puluh ";
    public String ratusan = "Ratus ";
    
    public String [] huruf = {"Nol", "Satu ", "Dua ", "Tiga ", "Empat ", "Lima ", "Enam ", "Tujuh ", "Delapan ", "Sembilan ", "Sepuluh ", "Sebelas "};
    public String Deklarasi(int num){
        if (num<=11)
            return huruf[num]; 
        if (num>11 && num<=19){
            num= num%10;
            return huruf[num]+belasan;
        }
        if (num>19 && num<=99){
            return huruf[num/10]+puluhan+huruf[num%10];
        }
        if (num==100){
            return "Seratus ";
        }
        if (num>100&& num<200){
            return "Seratus "+Deklarasi(num%100);
        }
        if (num>=200 && num<=999){
            return huruf[num/100]+ratusan+Deklarasi(num%100);
        }
        if (num==1000){
            return "Seribu";
        }
        return "";
    }
    public int Deklarasi(String bilang){
        int i;
        for ( i=0; i<=1000; i++){
            String ang = Deklarasi(i);
            if (bilang.equalsIgnoreCase(ang)){
                return i;
            }
        } 
        return i;
    }
}
    
            

