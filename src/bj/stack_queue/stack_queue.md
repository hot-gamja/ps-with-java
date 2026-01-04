## 코테에서 결론: `ArrayDeque` 하나로 거의 끝

- **스택**도 되고 **큐**도 되고 **덱**도 됨
- 그래서 보통 `Stack`, `LinkedList` 대신 **`ArrayDeque` 추천**

```java
Deque<Integer> dq = new ArrayDeque<>();
```

---

## 1) 스택(후입선출, LIFO)로 쓰는 법

**상황:** “마지막에 넣은 거부터 처리”, “짝 맞추기”, “되돌리기”

✅ 추천 메서드(스택처럼)

| 동작      | 메서드      |
| --------- | ----------- |
| 넣기      | `push(x)`   |
| 빼기      | `pop()`     |
| 맨위 보기 | `peek()`    |
| 비었나    | `isEmpty()` |

```java
Deque<Character> st = new ArrayDeque<>();
st.push('(');
char top = st.peek();
char out = st.pop();
```

---

## 2) 큐(선입선출, FIFO)로 쓰는 법

**상황:** “순서대로 처리”, “BFS”, “대기열”

✅ 추천 메서드(큐처럼)

| 동작      | 메서드      |
| --------- | ----------- |
| 넣기      | `offer(x)`  |
| 빼기      | `poll()`    |
| 맨앞 보기 | `peek()`    |
| 비었나    | `isEmpty()` |

```java
Queue<Integer> q = new ArrayDeque<>();
q.offer(1);
q.offer(2);
int a = q.poll(); // 1
int b = q.peek(); // 2
```

> `remove()`/`element()`는 비었을 때 예외 → 코테에선 보통 `poll/peek`가 안전

---

## 3) 덱(양쪽 처리)로 쓰는 법

**상황:** “앞/뒤에서 넣고 빼기”, “회전 큐”, “AC(5430)”

✅ 앞/뒤 메서드 정리

| 동작 | 앞(Front)       | 뒤(Back)       |
| ---- | --------------- | -------------- |
| 넣기 | `offerFirst(x)` | `offerLast(x)` |
| 빼기 | `pollFirst()`   | `pollLast()`   |
| 보기 | `peekFirst()`   | `peekLast()`   |

```java
Deque<Integer> dq = new ArrayDeque<>();
dq.offerFirst(1); // 앞에 추가
dq.offerLast(2);  // 뒤에 추가
int x = dq.pollFirst(); // 1
int y = dq.pollLast();  // 2
```

---

## 4) “어떤 걸 써야 하지?” 선택 치트키

- **스택**: 괄호검사 / 폭발문자열 / 오큰수(단조스택) / 되돌리기
  → `Deque` + `push/pop/peek`
- **큐**: BFS(최단거리) / 순서대로 처리 / 시뮬레이션
  → `Queue` + `offer/poll/peek`
- **덱**: 앞뒤 삭제/추가 / 회전 / 투포인터 느낌의 앞뒤 처리
  → `Deque` + `offerFirst/offerLast/pollFirst/pollLast`
- **우선순위 필요**: 가장 큰/작은 것 먼저
  → `PriorityQueue` (이건 큐랑 별개)

---

## 5) 실전 템플릿 (복붙용)

### 스택 템플릿

```java
Deque<Integer> st = new ArrayDeque<>();
st.push(x);
if (!st.isEmpty()) st.pop();
```

### 큐(BFS) 템플릿

```java
Queue<int[]> q = new ArrayDeque<>();
q.offer(new int[]{sx, sy});
while (!q.isEmpty()) {
  int[] cur = q.poll();
}
```

### 덱 템플릿

```java
Deque<Integer> dq = new ArrayDeque<>();
dq.offerFirst(x);
dq.offerLast(y);
dq.pollFirst();
dq.pollLast();
```
