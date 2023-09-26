package javaChallengeQnA;

public class Ques1 {
	public static void main(String[] args) {

		String input = "Hello World";
		String[] splitq = input.split(" ");
		for (int i = 0; i < splitq.length; i++) {
			if (i == splitq.length - 1) {
				System.out.println(splitq[i].length() + " World  ");
			}
		}
//	
//	String input1="flyme to the moon";
//	String[] split1 = input1.split (" " );
//	for( int j=0; j<split1.length;j++) {
//		if(j==split1.length-1) {
//			System.out.println(split1[j].length()+  " moon ");
//		}
//	}
//	
//    String input2="luffy is still joyboy";
//	String[] split2 = input2.split (" " );
//	for( int k=0; k<split2.length;k++) {
//		if(k==split2.length-1) {
//			System.out.println(split2[k].length()+  " joyboy ");
//		}
//		}

		String ip = "i Learn Automation";
		String[] split = ip.split(" ");
		for (int i = 0; i < split.length; i++) {
			if (i == split.length - 1) {
				System.out.println(split[i].length() + " " + split[i]);

			}

		}
	}

}
