import java.util.StringTokenizer;

public class StringTokenizerEx {

	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer("ȫ�浿/��ȭ/ȫ��/����/����","/"); //�����ڷ� '/'���
		while (st.hasMoreTokens()) // ��ū�� �ִµ���
			System.out.println(st.nextToken());

	}

}
