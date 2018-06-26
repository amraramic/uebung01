package ueb01;

class Palindrom {
	static boolean istPalindrom(String s) {


		if (s.length() == 1) {
			return true;
		}
		CharStack erstehaelfte = new CharStackImpl();
			char [] chararr = s.replaceAll(" ", "").toLowerCase().toCharArray();
			int i = 0;

			for (; i < chararr.length / 2; i++) {
				erstehaelfte.push(chararr[i]);
			}

			if (chararr.length % 2  == 1){
				i++;
			}
			for (; i < chararr.length; i++){
				if (erstehaelfte.pop() != chararr[i]) {
					return false;
				}
			}
			return true;
	}
}
