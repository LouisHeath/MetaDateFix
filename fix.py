import tkinter
from tkinter import *
import os

#---------------------------------------------------------
#
# This terminal command on Mac works
#     SetFile -d "06/16/2015 12:00:00" "/Users/path/img.jpg">
#
#----------------------------------------------------------

def fix(f):
    year  = f[4:8]
    month = f[8:10]
    day   = f[10:12]
    os.system("SetFile -d \"" + month + "/" + day + "/" + year +
        " 12:00:00\" \"files/" + f + "\"")
    print("fixed " + f)

def main():
    dirs = os.listdir("files")

    for file in dirs:
        fix(file)

main()
