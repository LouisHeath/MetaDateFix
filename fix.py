import tkinter
from tkinter import *
import os

#---------------------------------------------------------
#
# This terminal command on Mac works
#     touch –t YYYYMMDDhhmm /path/img.jpg
#
#----------------------------------------------------------

def fix(f):
    year  = f[4:8]
    month = f[8:10]
    day   = f[10:12]
    os.system("touch -t " + year + month + day +
        "1200 files/" + f)
    print("fixed " + f)

def main():
    dirs = os.listdir("files")

    for file in dirs:
        fix(file)

main()
