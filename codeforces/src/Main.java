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
		int testCase = Integer.parseInt(br.readLine());
		while(testCase-- > 0) {
			String str = br.readLine();
			int n = str.length();
			char arr[] = new char[n + 2];
			for(int i = 1; i<=n; i++)
				arr[i] = str.charAt(i-1);
			arr[0] = arr[n+1] = 'R';
			int ans = 1;
			for(int i = 0; i<=n+1; i++) {
				int c = 1;
				if(arr[i] == 'R') 
					continue;
				while(i <= n+1) {
					if(arr[i] != 'R') {
						c++;
					}else {
						ans = Math.max(c, ans);
						break;
					}
					i++;
				}
			}
			bw.write(ans + "\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}


}
