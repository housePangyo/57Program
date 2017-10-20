{-# LANGUAGE OverloadedStrings #-}

module Main where

import Lib
import qualified Data.Text as T

readName :: IO String
readName = getLine

makeMessage :: String -> String
makeMessage name = "Hello, " ++ name ++ ", " ++ "nice to meet you"

main :: IO ()
main = do
  putStrLn "What is your name?"
  name <- readName
  putStrLn $ makeMessage name
