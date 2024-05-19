## Single Level Inheritance
Father <- Child 
```
class Father {
    
}
class Child extends Father {

}
```
## Multi Level Inheritance
GrandFather <- Father <- Child
```
class GrandFather {

}
class Father extends GrandFather {

}
class Child extends Father {

}
```
## Hierarchical 
<pre>
********Father********
   ^      ^       ^
   |      |       |
Child 1 Child 2 Child 3
</pre>
```
class Father {

}
class Child1 extends Father {
    
}
class Child2 extends Father {

}
class Child3 extends Father {

}
```