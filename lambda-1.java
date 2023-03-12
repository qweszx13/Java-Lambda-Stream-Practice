int[] arr = new int[5];
Arrays.setAll(arr, (i) -> (int)(Math.random() * 5)+1);
for(int x : arr){
    System.out.print(x)
}
System.out.println("");
// 위 동작은 아래와 같다.

Arrays.setAll(arr, method())

int method(){
    return (int)(Math.random() * 5)+1;
}

for(int x : arr){
    System.out.print(x)
}
System.out.println("");