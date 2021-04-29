
public class StringTut {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
StringTut st = new StringTut();
st.avoid();
	}

	private void avoid() {
		// TODO Auto-generated method stub
		String institute = "Welcome - to - Payilagam -";
         String[] rename=institute.split("-");
         for(int i=0;i<rename.length;i++)
         {
        	 System.out.print(rename[i]);
         }

}
}


