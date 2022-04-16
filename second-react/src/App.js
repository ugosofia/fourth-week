import logo from './logo.svg';
import './App.css';
import City from './components/City';


function App() {
 const city = {
   name: 'Milan'
 }
 
  return (
    <div>
  <div class="img">
      <img src="/src/components/Img.js" className="image" alt="img" />
  </div>

    <City city = {city}/>
    <Img />
    </div>
  
  );
  
}

export default App;
