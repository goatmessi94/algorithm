package recursive;

import java.util.ArrayList;

public class RecursiveFunction{
    public ArrayList<String> recursiveData = new ArrayList<>();

    //1부터 n까지의 수중 4개 고르는 모든 방법을 찾는 함수
    //숫자 네개를 문자로 출력
    public ArrayList<String> pick(int n){
        ArrayList<String> pickArray = new ArrayList<>();
        for(int i=1;i<=n;i++){
            for(int j=i+1;j<=n;j++){
                for(int k=j+1;k<=n;k++){
                    for(int l=k+1;l<=n;l++){
                        String pickStr;
                        pickStr=Integer.toString(i)+Integer.toString(j)+Integer.toString(k)+Integer.toString(l);
                        pickArray.add(pickStr);
                    }
                }
            }
        }
        return pickArray;
    }

    public void recursivePick(String combo, String plus) {
        if (combo != "" && combo.length() == 4) {
            recursiveData.add(combo);
        }

        for (int i=0; i<plus.length(); i++) {
            recursivePick(combo + plus.charAt(i), plus.substring(0,i) + plus.substring(i+1));
        }

    }


    public static void main(String[] args){
        int n=6;
        RecursiveFunction rf = new RecursiveFunction();

        ArrayList<String> pickStr = rf.pick(n);
        System.out.println("1부터 n까지의 숫자중 4개를 선택하여 모두 출력: 총 "+ pickStr.size()+"개/"+ pickStr.toString());

        rf.recursivePick("", "123456");
        System.out.println("recursive를 이용한 중복 제거" + rf.recursiveData.size()+"개/" + rf.recursiveData.toString());
    }
}