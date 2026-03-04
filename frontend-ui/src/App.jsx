
import {useEffect,useState} from 'react'
import axios from 'axios'
export default function App(){
 const [msg,setMsg]=useState("Loading...");
 useEffect(()=>{
  axios.post("http://localhost:8084/orders",{userId:1,total:100})
   .then(()=>setMsg("Order created. Check service logs for Kafka events"))
 },[])
 return (
  <div style={{fontFamily:"Arial",padding:"40px"}}>
   <h1>ShopZone Demo UI</h1>
   <p>{msg}</p>
  </div>
 )
}
