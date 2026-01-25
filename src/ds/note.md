# 📌 Java 코테 메소드 치트시트

---

## 🔹 문자열 (String)

```java
s.length()                 // 문자열 길이
s.charAt(i)                // i번째 문자
s.lastIndexOf('.')         // 마지막 '.' 위치
s.substring(i)             // i부터 끝까지 자르기
```

✔ 확장자 뽑기

```java
String ext = s.substring(s.lastIndexOf('.') + 1);
```

---

## 🔹 배열/리스트 정렬

```java
Arrays.sort(arr);           // 배열 오름차순
Collections.sort(list);     // 리스트 오름차순
```

### Comparator (2개 이상 기준)

```java
list.sort((a,b) -> {
    if (a.x != b.x) return a.x - b.x;
    return a.y - b.y;
});
```

---

## 🔹 HashMap (카운트)

```java
map.get(key)
map.put(key, value)
map.getOrDefault(key, 0)
map.keySet()
```

✔ 카운트 공식

```java
map.put(key, map.getOrDefault(key, 0) + 1);
```

---

## 🔹 StringBuilder (출력)

```java
sb.append(x);
sb.toString();
```

✔ 출력 템플릿

```java
StringBuilder sb = new StringBuilder();
sb.append(a).append(' ').append(b).append('\n');
System.out.print(sb.toString());
```

---

## 🔹 입출력

```java
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
String s = br.readLine();
```

---

## ⭐ 코테에서 자주 쓰는 패턴 3개

1️⃣ 카운트 문제 → HashMap + getOrDefault  
2️⃣ 정렬 문제 → Arrays.sort / list.sort + Comparator  
3️⃣ 출력 많음 → StringBuilder

---

## 🔹 입출력
