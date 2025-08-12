public class TimeConverter{
    public static void main(String[] args){
	int TotalSeconds = 3672;
	int hours = TotalSeconds / 3600;
	int minutes = (TotalSeconds % 3600) / 60;
	int seconds = TotalSeconds % 60;
	System.out.println("Hours :" + hours);
	System.out.println("Minutes :" + minutes);
	System.out.println("Seconds :" + seconds);
	}
}
	