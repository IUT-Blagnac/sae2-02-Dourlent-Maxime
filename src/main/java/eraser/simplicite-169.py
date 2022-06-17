"""
Replace single space to nothing.
If the string has two or more than two spaces, then do nothing.
:param string : string to edit
:return : edited string with modifications
"""


def erase(string):
    string = string.strip()
    listeString = list(string)
    for i, char in enumerate(listeString):
        if char == " " and listeString[max(i - 1, 1)] != " " and listeString[min(i + 1, len(listeString) - 2)] != " ":
            del listeString[i]
    return "".join(char for char in listeString)





