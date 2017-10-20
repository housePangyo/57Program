{-# LANGUAGE OverloadedStrings #-}
module Lib (no1) where

import System.IO
import qualified Data.Text as T

prompt :: String -> IO String
prompt msg = putStr msg >> hFlush stdout >> getLine

welcome :: String -> String
welcome name = "Hello, " ++ name ++ ", " ++ "nice to meet you"

no1 :: IO ()
no1 = do
  name <- prompt "What is your name? "
  putStrLn $ welcome name
