import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(br.readLine());
		while(T-- > 0) {
			int n = Integer.parseInt(br.readLine());
			char[] arr = br.readLine().toCharArray();
			int[] a = new int[n];
			int[] b = new int[n];
			
			boolean firstOne = false;
			for(int i = 0; i<n; i++) {
				if(arr[i] == '0') 
					a[i] = b[i] = 0;
				if(arr[i] == '1') {
					if(!firstOne) {
						a[i] = 1;
						b[i] = 0;
						firstOne = true;
					}else {
						a[i] = 0;
						b[i] = 1;
					}
				}
				if(arr[i] == '2') {
					if(!firstOne) a[i] = b[i] = 1;
					else {
						a[i] = 0;
						b[i] = 2;
					}
				}
			}
			 
			for(int i = 0; i<n; i++)
				bw.write(a[i] + "");
			bw.write("\n");
			for(int i = 0; i<n; i++)
				bw.write(b[i] + "");
			bw.write("\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}


}
