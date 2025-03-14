# ProblemSolving1

알고리즘 : 
- TwoPointers

- SlidingWindow

- 이분검색

- 결정알고리즘 : 
            1. lt ~ rt(lt rt는 정렬) 사이 문제가 요구하는 사이에 답이 있는 문제에만 적용
            2. 중간값이 답으로 가능한지 체크
            3. 체크해가면서 가장 알맞는 (문제에 따라 크거나 작은) 값을 찾아나감. == 더 좋은 답을 향해 좁혀나간다.

- DFS 깊이우선탐색(Depth-First Search) : 현재 경로를 최대한 깊숙이 먼저 탐색, 스택을 사용하여 탐색, 백트래킹 하며 경로를 탐색

- BFS 넓이우선탐색(Breadth-First Search) : 같은 레벨의 모든 노드를 먼저 탐색, 큐를 사용하여 탐색, 보통 최단거리 문제에 활용

자료구조 : 자바 컬렉션 프레임워크(JCF 구조)
- HashMap
- TreeSet
- Stack = LIFO
- Queue = FIFO
- 이진트리(상태트리) (부모 - 왼쪽자식, 오른쪽자식) : 전위순회, 중위순회, 후위순회

정렬 알고리즘 :
- 선택정렬 : 각 회차에서 최소값을 선택해서 제자리에 보내는 정렬.(처음부터 끝까지 순회하면서 최솟값을 찾고, 그 최솟값을 가장 앞자리의 인덱스와 교환해나감.)
- 버블정렬 : 서로 인접한 두 값을 비교해서 큰값을 뒤로 보내는 정렬방식.
- 삽입정렬 : 왼쪽은 항상 정렬되어 있고, 새로운 값을 정렬에 알맞게 삽입하는 방법.

그래프 : 그래프는 인접행렬, 인접리스트로 표현한다.
- 무방향그래프
- 방향그래프 : 행 -> 열
- 가중치 방향그래프
    인접행렬 : 
    인접리스트 :

중복순열 :

순열 : DFS

조합 : DFS

그리디 알고리즘 : 현재 시점에서 최대이익을 선택해 나가는것.
    1. 탐욕적 선택속성 : "지금의 최선이 전체의 최선에 포함된다" => 현재 순간에 선택한 최선의 해가 전체 최적해의 일부가 된다.
    2. 부분문제 최적성 : "남은 문제도 같은 원칙으로, 같은 방법으로 최적해를 구할 수 있다" => 원래 문제의 최적해가 부분 문제의 최적해를 포함한다.
    3. 스위핑 라인 알고리즘(구현 도구) : 이벤트를 순차적으로 고려해나가는것.