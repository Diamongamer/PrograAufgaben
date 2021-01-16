module Test where

isMatrix :: [[Int]] -> Bool --a)
isMatrix [] = False
isMatrix [[]] = False
isMatrix [x1] = True
isMatrix (x1:x2:xs) = (length x1 == length x2) && isMatrix (x2:xs)

dimension :: [[Int]] -> [Int]
dimension x = if isMatrix x == True
                then
                  [numberOfRows x, numberOfCollumns x]
                else [-1,-1]

numberOfRows :: [[Int]] -> Int
numberOfRows (x:xs) = length x

numberOfCollumns :: [[Int]] -> Int
numberOfCollumns x = length x

isQuadratic :: [[Int]] -> Bool
isQuadratic x = numberOfCollumns x == numberOfRows x

getRow :: [[Int]] -> Int -> [Int]
getRow x i | isMatrix x && i <= length x && i > 0 = x !! (i-1)
           | otherwise = []

getCol :: [[Int]] -> Int -> [Int]
getCol [] _ = []
getCol (x:xs) i | isMatrix (x:xs) && i <= length x && i>=0 = (x !! (i-1) : getCol xs i)
                | otherwise = []

trav :: [[Int]] -> [[Int]]
trav x = if isMatrix x then travHelper x 1 else [[]]

travHelper :: [[Int]] -> Int -> [[Int]]
travHelper x i | i < length x = getCol x i : travHelper x (i+1)
               | otherwise = []

setEntry :: [[Int]] -> Int -> Int -> Int -> [[Int]]
setEntry [] _ _ _ = []
setEntry (x:xs) i j a | isMatrix (x:xs) && i/=1 = x : setEntry xs (i-1) j a
                      | isMatrix (x:xs) && i==1 = setRow x j a : setEntry xs (i-1) j a
                      | otherwise = []

setRow :: [Int] -> Int -> Int -> [Int]
setRow [] _ _ = []
setRow (x:xs) j a | length (x:xs) >= 0 && j/=1 = x:setRow xs (j-1) a
                  | length (x:xs) >= 0 && j==1 = j:setRow xs (j-1) a
                  | otherwise = []