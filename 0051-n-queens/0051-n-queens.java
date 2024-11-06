class Solution {
    public List<List<String>> solveNQueens(int n) {
         List<List<String>> list = new ArrayList<>();

       start(n,list);
       return list; 
    }
     
     void display(char[][] board,int n,List list){
         List<String> l=new ArrayList();
		 for(int i=0;i<n;i++) {
			 l.add(new String(board[i]));
		 } 
		 list.add(l);
    

	  }
	  boolean safe(char[][] board,int row,int col,int n) {
		  for(int i=row,j=col;i>=0&&j>=0;i--,j--) {
			  if(board[i][j]=='Q')
				  return false;
		  }
		  for(int i=row;i>=0;i--) {
			  if(board[i][col]=='Q') {
				  return false;
			  }
		  }
		  for(int i=row,j=col;i>=0&&j<n;i--,j++) {
			  if(board[i][j]=='Q')
				  return false;
		  }
		  return true;
	  }
	  void place(char[][] board,int row,int n,List list) {
		  if(row==n) {
			  display(board,n,list);
			  return ;
		  }else {
			  for(int col=0;col<n;col++) {
				  if(safe(board,row,col,n)) {
					  board[row][col]='Q';
					  place(board,row+1,n,list);
					  board[row][col]='.';
				  }
			  }
		  }
	  }
    public void start(int n,List list) {
    	 char[][] board=new char[n][n];
    	 for(int i=0;i<n;i++) {
    		 for(int j=0;j<n;j++) {
    			 board[i][j]='.';
    		 }
    	 }
    	 place(board,0,n,list);
    } 
}