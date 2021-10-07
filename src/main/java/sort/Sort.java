package sort;

public class Sort {

  private static void insertSort(int[] a) {

    boolean needNetPass = true;
    for (int k = 1; k<a.length && needNetPass;k++){
      needNetPass=false;
      for(int i=0;i<a.length-1;i++){
        if(a[i]>a[i+1]){
          int temp =a[i];
          a[i]=a[i+1];
          a[i+1]=temp;
          needNetPass=true;
        }
      }
    }

  }

}
