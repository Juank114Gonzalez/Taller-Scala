/*
Sucesor
 */
def suc(n: Int) = n+1

/*
Predecesor
 */
def pre(n: Int) = n-1


/*
Ejercicio 1
*/
def pow(x : Int,n: Int):Int=
  if(n==0) {
    1
  } else{
    x * pow(x,pre(n))
  }

pow(2,5)

/*
Ejercicio 2
*/
def factorial(n : Int) : Int =
  if(n==0) {
    1
  } else {
    n * factorial (pre(n))
  }

factorial(4)

/*
Ejercicio 3
*/
def summation(n : Int) : Int =
  if(n==0){
    n
  }else{
    n + summation(pre(n))
  }

summation(5)

/*
Ejercicio 4
*/
def sum(x: Int,y: Int) : Int =
  if(x==0){
    y
  }else{
    suc(sum(pre(x),y))
  }

sum(10,9)

/*
Ejercicio 5
*/
def dif(x: Int,y: Int) : Int =

  if(x==y){
    0
  }else{

    if(y>x){
      -1 * suc(dif(pre(y),x))
    }else {
      suc(dif(pre(x), y))
    }
  }

dif(11,20)


/*
Ejercicio 6
*/
def prod(x :Int, y : Int) : Int =
  if(x==0){
    0
  }else{
    sum(y,prod(pre(x),y))
  }

prod(10,2)

/*
Ejercicio 7
*/
def div(x :Int, y : Int) : Int =
  if(x==0){
    0
  }else{
    dif(y,div(suc(x),y))
  }

div(100,10)


