# 템플릿

## 정리
자릿수 쪼개기: a = n / 10, b = n % 10

새 수 만들기: b * 10 + ( (a + b) % 10 )

사이클: while(true) { ... if (cur == original) break; }

줄여 가는 그리디: while (N >= 0) { if (조건) { ...; return; } N -= k; }

완전탐색: for (i ...) for (j ...) if (조건) 최소/최대 갱신

양방향 매핑: 배열 + HashMap

“순서 있고, 인덱스로 자주 봄” → ArrayList / 배열

“앞/뒤로 넣고 빼는 큐/덱” → ArrayDeque (대부분 여기)

“중복 제거 / 방문 체크 / 존재 확인” → HashSet

“카운팅 / 키로 값 저장” → HashMap