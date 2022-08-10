package org.curlybrace.oopj.ocp1z0_829.ch06.mystudies.Study005_InheritingMembers.Study005_03_HidingVariables;

class ParentVariable {

    String instanceVariable = "parent variable";
    static String staticVariable = "parent static variable";
    
    public void printVariables() {
        System.out.println(instanceVariable);
        System.out.println(staticVariable);
    }
}

 class ChildVariable extends ParentVariable {

    String instanceVariable = "child variable";
    static String staticVariable = "child static variable";
    
    @Override
    public void printVariables() {
        System.out.println(instanceVariable);
        System.out.println(staticVariable);
    }
}

public class A2 {

	public static void main(String[] args) {
		ParentVariable parentVariable = new ParentVariable();
		ParentVariable childVariable = new ChildVariable();

		parentVariable.printVariables();
		childVariable.printVariables();
		
		System.out.println("------------------------------");
        System.out.println(parentVariable.instanceVariable);
        System.out.println(parentVariable.staticVariable);	
        System.out.println(childVariable.instanceVariable);
        System.out.println(childVariable.staticVariable);	        

	}

}
