#!/usr/bin/env bash

latexmk tex/DVG303_lab1.tex -outdir=build -pdf -pdflatex="pdflatex -interaction=nonstopmode -shell-escape"
