class Anagram{
	public static void main(String[] args){
		String x="Mohit";
		String y="MohitSingh";
		boolean isAnagram=true;
		int xl[]=new int[256];
		//int yl[]=new int[256];
		for(char c:x.toCharArray()){
			int index=(int)c;
			xl[index]++;
		}
		//for(int i=0;i<256;i++)
		//System.out.println(xl[i]);
	//System.out.println("------------------------------");
		for(char c:y.toCharArray()){
			int index=(int)c;
			xl[index]--;
		}
	//	for(int i=0;i<256;i++)
		//System.out.println(xl[i]);
		for(int i=0;i<256;i++){
			if(xl[i]!=0)
			isAnagram=false;
		System.out.println(xl[i]);
			break;
		}
		if(isAnagram){
		System.out.println("Anagram");
		}
		else{
		System.out.println("Not Anagram");
		}
	}	
}