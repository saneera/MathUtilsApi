# MathUtilApi

### Reference Documentation
This is an exercise for 
Import this as a Maven project, run in a Servlet Container like Tomcat(TM) 

how its working

End point
http://localhost:8080/v1/findTheSqureRootOfSumoftheSquresOfHighestThreeNumber

# Test cases

### Pass test cases
 
```
curl -X POST \
  http://localhost:8080/v1/findTheSqureRootOfSumoftheSquresOfHighestThreeNumber \
  -H 'cache-control: no-cache' \
  -H 'content-type: application/json' \
  -d '{
	"data": [5,4,6,1]
}
'
```


### Failure Test cases

```
curl -X POST \
  http://localhost:8080/v1/findTheSqureRootOfSumoftheSquresOfHighestThreeNumber \
  -H 'cache-control: no-cache' \
  -H 'content-type: application/json' \
  -d '{

}
'
```

```
curl -X POST \
  http://localhost:8080/v1/findTheSqureRootOfSumoftheSquresOfHighestThreeNumber \
  -H 'cache-control: no-cache' \
  -H 'content-type: application/json' \
  -d '{
	"data": []
}'
```

```
curl -X POST \
  http://localhost:8080/v1/findTheSqureRootOfSumoftheSquresOfHighestThreeNumber \
  -H 'cache-control: no-cache' \
  -H 'content-type: application/json' \
  -d '{
	"data": [1,2]
}'
```

