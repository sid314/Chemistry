#!/usr/bin/env bash
touch ./tests.txt
for i in {1..300}; do
  java Chemistry | cat >>./tests.txt
  printf "\n" | cat >>./tests.txt
done
echo "tests generated"
