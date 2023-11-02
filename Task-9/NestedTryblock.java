package ExceptionHandling;

public class NestedTryCatchBlock{
	public static void main(String[] args){
		
		try{
			int[] array = {1,2,4,4,1,2,0};
			try{
				
				for(int i = 0;i<array.length;i++){
					array[i] = array[i+1] / array[i];
				}
			}
			catch(ArithmeticException e){
				System.out.println(e);
			}

		}
		catch(IndexOutOfBoundsException e){
			System.out.println(e);
		}
		catch (ArithmeticException e){
			System.out.println(e);
		}
		catch (Exception e){
			System.out.println(e);
		}
		finally{
			System.out.println("Always get executed");
		}
	}
}