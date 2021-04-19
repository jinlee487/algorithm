package greedy_algorythm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
/*
 * SOLVED!!
 * https://www.acmicpc.net/problem/45878
 * 카드정렬
 * https://gh402.tistory.com/29
*/
public class CardArrangement {

	public static void main(String[] args) throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        Long ans=0L;
        for(int i=0;i<N;i++){
            pq.add(Integer.parseInt(br.readLine()));
        }
        int cnt=0;
        int value=0;
        while (!pq.isEmpty()){
            if(cnt % 2 == 0) value = pq.poll();
            else{
                value += pq.poll();
                pq.add(value);
                ans += value;
            }
            cnt++;
        }
        System.out.println(ans);

    }
}
