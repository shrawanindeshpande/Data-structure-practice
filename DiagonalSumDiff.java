
public class DiagonalSumDiff {
	int diagonalSumDifference(int N, int[][] Grid) {
        // code here
        int pdia=0;
        int sdia=0;
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                if(i==j){
                    pdia+=Grid[i][j];
                }
                if(i==N-j-1){
                    sdia+=Grid[i][j];
                }
            }
        }
        return Math.abs(pdia-sdia);
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int matrix[][]={{12, 4, 5, 2}, {6, 8, 3, 1}, {9, 3, 5, 4},{3, 5, 3, 1}};
		DiagonalSumDiff dd=new DiagonalSumDiff();
		System.out.println(dd.diagonalSumDifference(4, matrix));

	}

}
