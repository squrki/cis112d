class Solution:
    def networkDelayTime(self, times: List[List[int]], n: int, k: int) -> int:
        # 1. Build adjacency list (graph)
        graph = {i: [] for i in range(1, n + 1)}
        for u, v, w in times:
            graph[u].append((v, w))  # from u -> v with cost w

        # 2. Distance array
        INF = float('inf')
        dist = [INF] * (n + 1)
        dist[k] = 0

        # 3. Min-heap of (time_so_far, node)
        pq = [(0, k)]  # start at k with time 0

        while pq:
            cur_time, node = heapq.heappop(pq)

            # Optimization: if this popped entry is stale, skip it
            if cur_time > dist[node]:
                continue

            # 4. Relax neighbors
            for nei, w in graph[node]:
                new_time = cur_time + w
                if new_time < dist[nei]:
                    dist[nei] = new_time
                    heapq.heappush(pq, (new_time, nei))

        # 5. Compute answer
        # Ignore index 0 since nodes are 1..n
        max_time = max(dist[1:])

        return -1 if max_time == INF else max_time