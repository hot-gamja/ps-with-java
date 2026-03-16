```java
length()              // 길이
charAt(i)             // i번째 문자
substring(a)          // a부터 끝까지
substring(a, b)       // a부터 b-1까지
contains("x")         // 포함 여부
indexOf("x")          // 처음 위치
lastIndexOf("x")      // 마지막 위치
equals("x")           // 내용 비교
equalsIgnoreCase("x") // 대소문자 무시 비교
compareTo("x")        // 사전순 비교 (음수/0/양수)
toUpperCase()         // 대문자
toLowerCase()         // 소문자
trim()                // 앞뒤 공백 제거 (ASCII 공백만)
strip()               // 앞뒤 공백 제거 (유니코드 포함)
replace("a", "b")     // 문자/문자열 치환
replaceAll("\\d", "#") // 정규식으로 치환
split(",")            // 나누기 (정규식)
startsWith("ab")      // 시작 확인
endsWith("yz")        // 끝 확인
isEmpty()             // 빈 문자열 확인 (length == 0)
isBlank()             // 공백 포함 빈 문자열 확인
repeat(n)             // n번 반복 ("ab".repeat(3) → "ababab")
toCharArray()         // char[] 배열로 변환
String.valueOf(x)     // 숫자 → 문자열
String.join("-", a, b) // 구분자로 합치기
```

---

## StringBuilder (문자열 조작 시 필수)

> `+` 연산 반복 대신 `StringBuilder` 사용 → 시간복잡도 개선

```java
StringBuilder sb = new StringBuilder();
sb.append("hello");       // 뒤에 추가
sb.insert(2, "XY");       // 인덱스 2 앞에 삽입
sb.delete(1, 3);          // 1~2번 인덱스 삭제
sb.deleteCharAt(0);       // 특정 인덱스 문자 삭제
sb.replace(0, 2, "AB");   // 0~1번 인덱스를 "AB"로 교체
sb.reverse();             // 문자열 뒤집기
sb.charAt(0);             // 특정 위치 문자 조회
sb.setCharAt(0, 'Z');     // 특정 위치 문자 수정
sb.length();              // 길이
sb.toString();            // String으로 변환
```

---

## Character (char 판별)

```java
Character.isDigit(c)       // 숫자인지
Character.isLetter(c)      // 알파벳인지
Character.isLetterOrDigit(c) // 알파벳 또는 숫자인지
Character.isUpperCase(c)   // 대문자인지
Character.isLowerCase(c)   // 소문자인지
Character.isWhitespace(c)  // 공백인지
Character.toUpperCase(c)   // 대문자로 변환
Character.toLowerCase(c)   // 소문자로 변환
```

---

## 자주 쓰는 패턴

```java
// 문자열 → char 배열 순회
for (char c : s.toCharArray()) { ... }

// 인덱스와 함께 순회
for (int i = 0; i < s.length(); i++) {
    char c = s.charAt(i);
}

// 알파벳 빈도 카운트
int[] freq = new int[26];
for (char c : s.toCharArray()) freq[c - 'a']++;

// 팰린드롬 확인
String rev = new StringBuilder(s).reverse().toString();
boolean isPalin = s.equals(rev);

// 문자열 → 정수
int n = Integer.parseInt("123");

// 정수 → 문자열
String str = String.valueOf(123);   // 또는 Integer.toString(123)
```
