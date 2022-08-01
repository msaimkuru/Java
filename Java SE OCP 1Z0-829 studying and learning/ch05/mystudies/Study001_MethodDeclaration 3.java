package org.curlybrace.oopj.ocp1z0_829.ch05.mystudies;

/* Terminal commands to run program
 * curlybrace@saim-MacBook-Pro src % javac org/curlybrace/oopj/ocp1z0_829/ch05/mystudies/Study001_MethodDeclaration.java
 * curlybrace@saim-MacBook-Pro src % java org.curlybrace.oopj.ocp1z0_829.ch05.mystudies.Study001_MethodDeclaration      
 */

public class Study001_MethodDeclaration {

	public int deadCodeMethod() {
		if(1 < 2)
			return -1;
		
		return 0;	//dead code
	}
	
	public final void nap(int minutes) throws InterruptedException{};
	
	public static void main(String[] args) {
		System.out.println("""
		-------------------- M E T H O D	  D E C L A R A T I O N --------------------------------------------------------------------------
		public final void nap(int minutes) throws InterruptedException{}
		---------------------------------S t r u c t u r e----------------------------------------------------------------------------------------
		public						:	Access Modifier		(Not required, when omitted defaults to package-private
		final						:	Optional Specifier	(Not Required)
		void						:	Return Type		(Required)
		nap						:	Method Name		(Required)
		()						:	Parentheses		(Required)
		int minutes					:	Parameter List		(Required but can be empty parentheses)
		throws InterruptedException			:	Exception list		(Not Required)
		{...}						:	Method Body		(Required except for abstract methods)
		------------------------------------------------------------------------------------------------------------------------------------------				
		"""
		);		
	}
}