class Solution {
    public int compress(char[] chars) {
        int len = chars.length;
		StringBuffer str = new StringBuffer();
		
		// int cnt = 1;
		// for(int i = 1; i<len; i++) {
		// 	if(chars[i] == chars[i-1]) {
		// 		cnt++;
		// 	}else {
		// 		if(cnt > 1) {
		// 			str.append(chars[i-1]).append(cnt);
		// 		}else {
		// 			str.append(chars[i-1]);
		// 		}
		// 		cnt = 1; 
		// 	}
		// }
		
		// str.append(chars[len-1]);
		// if(cnt > 1) {
		// 	str.append(cnt);
		// }

        int cnt = 0;
		for(int i = 0; i<len; i++) {
			if(i < len - 1) {
				if(chars[i] == chars[i+1]) {
					cnt++;
				}else {
					str.append(chars[i]);
					if(cnt > 0) {
						str.append(cnt+1);
					}
					cnt = 0;
				}
			}else {
                str.append(chars[i]);
                if(cnt > 0){
                    str.append(cnt+1);
                }
            }
		}

        
		
        for(int i = 0; i<str.toString().length(); i++) {
            chars[i] = str.toString().charAt(i);
        }
        
        return str.toString().length();
    }
}