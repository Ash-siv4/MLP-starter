// App.js
import React from 'react';
import ReactDOM from 'react-dom';
import ProductList from './ProductList';
import Cart from './Cart';

class App extends React.Component {
    render() {
        return (
            <div>
                <h1>Monolithic Legacy Project</h1>
                <ProductList />
                <Cart />
            </div>
        );
    }
}

ReactDOM.render(<App />, document.getElementById('root'));