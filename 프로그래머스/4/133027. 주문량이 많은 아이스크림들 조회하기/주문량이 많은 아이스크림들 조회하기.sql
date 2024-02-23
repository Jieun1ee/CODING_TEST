-- 코드를 입력하세요
SELECT A.FLAVOR
FROM FIRST_HALF A JOIN JULY B ON A.FLAVOR = B.FLAVOR
GROUP BY A.FLAVOR
ORDER BY SUM(A.TOTAL_ORDER) + SUM(B.TOTAL_ORDER) DESC
LIMIT 3;