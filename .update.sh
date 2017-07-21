#!/bin/bash

if [ -d ui ];then
	git rm -rf ui
	git commit -m "removed previous UI folder"
fi

git clone git@git.zone24x7.lk:Reusable-Starter-Kits/angular2_starter.git ui

rm -rf ui/.git
git add ui
git commit -m "UI assets updated"
