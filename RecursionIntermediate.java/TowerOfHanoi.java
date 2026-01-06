public class TowerOfHanoi {
    public static void tfh(int n , String src , String Help , String dest){
     if(n == 1){
        System.out.println("Disk 1 ko " + src + "se" + dest +"per rakho");
        return;
     }
        tfh( n - 1, src, Help, dest);
        System.out.println("Disk" + n+ "ko" + src + "to" + dest); 
        tfh( n -1, Help, dest, src);
    }
    public static void main(String[] args) {
        int n=3;
        tfh(n, "s", "h", "d");
    }
}
