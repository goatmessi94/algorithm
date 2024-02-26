package bruthe;

import java.util.Map;
import java.util.Scanner;

public class RecolorTheChessboard1018 {

    // 1. 8 * 8 크기로 자른 체스판 전달.
    // 2. 1행부터 비교하여 화이트와 블랙 비교
    // 3. 제일 작은 값 저장
    public static int solution(String[] chessBoard) {
        int whiteCount = 0;
        int blackCount = 0;

        String[] checkChess = {"WBWBWBWB","BWBWBWBW"};

        //화이트로 시작하는 경우
        for (int i = 0; i < chessBoard.length; i++) {
            if (i%2 == 0) {
                for (int k=0; k<8; k++) {
                    if (chessBoard[i].charAt(k) != checkChess[0].charAt(k)) whiteCount++;
                    if (chessBoard[i].charAt(k) != checkChess[1].charAt(k)) blackCount++;
                }
            }
            else {
                for (int k=0; k<8; k++) {
                    if (chessBoard[i].charAt(k) != checkChess[1].charAt(k)) whiteCount++;
                    if (chessBoard[i].charAt(k) != checkChess[0].charAt(k)) blackCount++;
                }
            }
        }

        return Math.min(whiteCount, blackCount); // 더 작은 것 출력 Math.min 함수로 출력 가능
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        String nm = sc.nextLine();

        int n = Integer.parseInt(nm.split(" ")[0]); //세로
        int m = Integer.parseInt(nm.split(" ")[1]); //가로

        String[] chessBoard = new String[n];

        for (int i=0; i<n; i++) {
            chessBoard[i] = sc.next();
        }

        int min = Integer.MAX_VALUE;
        // 자른 8*8 만큼 Solution함수에 전달
        // 반복문 을 통한 전달.
        // 복제 뜬걸 저장 해서 전달

        for (int y=0; y+7< m; y++) {
            for (int i=0; i+7<n; i++) {
                String[] cutChessBoard = new String[8];
                for (int j=i; j < 8+i; j++) {
                    cutChessBoard[j-i] = chessBoard[j].substring(y, y+8);
                }
                int tempMin = solution(cutChessBoard);
                if (min > tempMin) min = tempMin;
            }
        }

        //최종 min 값 출력
        System.out.println(min);
    }
}
